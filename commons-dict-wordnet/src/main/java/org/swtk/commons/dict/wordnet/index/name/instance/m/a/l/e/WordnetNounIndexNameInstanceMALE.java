package org.swtk.commons.dict.wordnet.index.name.instance.m.a.l.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceMALE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"male\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"08987826\", \"09647338\", \"01323721\"]}");
	add("{\"term\":\"maleate\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14970389\"]}");
	add("{\"term\":\"maleberry\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12261709\"]}");
	add("{\"term\":\"malebranche\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11171312\"]}");
	add("{\"term\":\"malecite\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06923293\", \"09679715\"]}");
	add("{\"term\":\"malediction\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07248656\"]}");
	add("{\"term\":\"malefactor\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09997190\"]}");
	add("{\"term\":\"maleficence\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04853764\", \"07566017\"]}");
	add("{\"term\":\"malemute\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02112715\"]}");
	add("{\"term\":\"maleness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05015411\"]}");
	add("{\"term\":\"maleo\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01804800\"]}");
	add("{\"term\":\"maleseet\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06923293\"]}");
	add("{\"term\":\"malevich\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11171426\"]}");
	add("{\"term\":\"malevolence\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04849544\", \"07565835\"]}");
	add("{\"term\":\"malevolency\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04849544\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }