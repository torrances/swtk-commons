package org.swtk.commons.dict.wordnet.index.name.instance.m.o.n.s;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceMONS {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"mons\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05529934\"]}");
	add("{\"term\":\"monsieur\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10349388\"]}");
	add("{\"term\":\"monsignor\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10349502\"]}");
	add("{\"term\":\"monsoon\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"11505141\", \"15263830\", \"11504970\"]}");
	add("{\"term\":\"monster\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"01462749\", \"10349658\", \"10129212\", \"10148446\", \"09515097\"]}");
	add("{\"term\":\"monstera\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07762725\", \"11809907\"]}");
	add("{\"term\":\"monstrance\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03789803\", \"06660791\"]}");
	add("{\"term\":\"monstrosity\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07381831\", \"10129212\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }