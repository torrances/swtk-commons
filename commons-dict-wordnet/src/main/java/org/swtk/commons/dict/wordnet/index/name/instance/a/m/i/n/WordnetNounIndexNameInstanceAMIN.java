package org.swtk.commons.dict.wordnet.index.name.instance.a.m.i.n;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceAMIN {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"amine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14763183\"]}");
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
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }