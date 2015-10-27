package org.swtk.commons.dict.wordnet.index.name.instance.s.a.l.m;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSALM {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"salmacis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09574281\"]}");
	add("{\"term\":\"salmagundi\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07822978\", \"08415730\"]}");
	add("{\"term\":\"salmi\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07608493\"]}");
	add("{\"term\":\"salmo\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02537980\"]}");
	add("{\"term\":\"salmon\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"04972548\", \"07811727\", \"09443301\", \"02537365\"]}");
	add("{\"term\":\"salmonberry\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"12677670\", \"12677843\", \"12678055\"]}");
	add("{\"term\":\"salmonella\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01371614\"]}");
	add("{\"term\":\"salmonellosis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14093229\"]}");
	add("{\"term\":\"salmonid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02537190\"]}");
	add("{\"term\":\"salmonidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02536983\"]}");
	add("{\"term\":\"salmwood\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12839106\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }