package org.swtk.commons.dict.wordnet.index.name.instance.p.y.r.o;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstancePYRO {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"pyrocellulose\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14819602\"]}");
	add("{\"term\":\"pyrocephalus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01552674\"]}");
	add("{\"term\":\"pyrochemistry\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13565482\"]}");
	add("{\"term\":\"pyroelectricity\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11455775\"]}");
	add("{\"term\":\"pyrogallol\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14639578\"]}");
	add("{\"term\":\"pyrogen\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"14608682\", \"14608838\"]}");
	add("{\"term\":\"pyrograph\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04036123\"]}");
	add("{\"term\":\"pyrographer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10516300\"]}");
	add("{\"term\":\"pyrography\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00940056\"]}");
	add("{\"term\":\"pyrola\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12276629\"]}");
	add("{\"term\":\"pyrolaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12276176\"]}");
	add("{\"term\":\"pyrolatry\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01048091\"]}");
	add("{\"term\":\"pyrolusite\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14717134\"]}");
	add("{\"term\":\"pyrolysis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07374677\"]}");
	add("{\"term\":\"pyromancer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10516410\"]}");
	add("{\"term\":\"pyromancy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05786026\"]}");
	add("{\"term\":\"pyromania\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09205826\"]}");
	add("{\"term\":\"pyromaniac\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10296724\"]}");
	add("{\"term\":\"pyrometer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04036210\"]}");
	add("{\"term\":\"pyromorphite\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14717285\"]}");
	add("{\"term\":\"pyrope\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15024627\"]}");
	add("{\"term\":\"pyrophobia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14407836\"]}");
	add("{\"term\":\"pyrophorus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02179263\"]}");
	add("{\"term\":\"pyrophosphate\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14639902\"]}");
	add("{\"term\":\"pyrophyllite\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14717436\"]}");
	add("{\"term\":\"pyroscope\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03858064\"]}");
	add("{\"term\":\"pyrosis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14358628\"]}");
	add("{\"term\":\"pyrostat\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04036530\"]}");
	add("{\"term\":\"pyrotechnic\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03353300\"]}");
	add("{\"term\":\"pyrotechnics\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00618932\", \"05627833\"]}");
	add("{\"term\":\"pyrotechny\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00618932\"]}");
	add("{\"term\":\"pyroxene\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14717557\"]}");
	add("{\"term\":\"pyroxylin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14819768\"]}");
	add("{\"term\":\"pyroxyline\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14819768\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }