package org.swtk.commons.dict.wordnet.indexbyname.instance.a.m.i;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceAMI {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"amia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02641590\"]}");
	add("{\"term\":\"amiability\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04662009\", \"07567157\"]}");
	add("{\"term\":\"amiableness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04662009\"]}");
	add("{\"term\":\"amianthum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12459482\"]}");
	add("{\"term\":\"amicability\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04662355\", \"07515069\"]}");
	add("{\"term\":\"amicableness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04662355\", \"07515069\"]}");
	add("{\"term\":\"amide\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14748425\"]}");
	add("{\"term\":\"amidopyrine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02705025\"]}");
	add("{\"term\":\"amigo\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09807962\"]}");
	add("{\"term\":\"amiidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02641465\"]}");
	add("{\"term\":\"amine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14763183\"]}");
	add("{\"term\":\"amino\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14641775\"]}");
	add("{\"term\":\"aminoaciduria\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14289670\"]}");
	add("{\"term\":\"aminoalkane\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14763183\"]}");
	add("{\"term\":\"aminobenzine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14778684\"]}");
	add("{\"term\":\"aminomethane\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14641893\"]}");
	add("{\"term\":\"aminopherase\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15101905\"]}");
	add("{\"term\":\"aminophylline\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02704843\"]}");
	add("{\"term\":\"aminoplast\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14767560\"]}");
	add("{\"term\":\"aminopyrine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02705025\"]}");
	add("{\"term\":\"aminotransferase\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15101905\"]}");
	add("{\"term\":\"amiodarone\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02705163\"]}");
	add("{\"term\":\"amir\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10072305\"]}");
	add("{\"term\":\"amish\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09697109\"]}");
	add("{\"term\":\"amitosis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13451247\"]}");
	add("{\"term\":\"amitriptyline\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02705434\"]}");
	add("{\"term\":\"amity\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"13993907\", \"04663286\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }