package org.swtk.commons.dict.wordnet.index.name.instance.s.q.u.i;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSQUI {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"squib\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04300588\"]}");
	add("{\"term\":\"squid\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01973921\", \"07797777\"]}");
	add("{\"term\":\"squiggle\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06416059\", \"06813891\"]}");
	add("{\"term\":\"squill\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"12481971\", \"12483087\", \"12483310\"]}");
	add("{\"term\":\"squilla\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01993157\"]}");
	add("{\"term\":\"squillidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01992827\"]}");
	add("{\"term\":\"squinch\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04300882\"]}");
	add("{\"term\":\"squint\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00880006\", \"14581007\"]}");
	add("{\"term\":\"squinter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10663166\"]}");
	add("{\"term\":\"squire\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"10663501\", \"10663276\", \"10663376\"]}");
	add("{\"term\":\"squirearchy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08404416\"]}");
	add("{\"term\":\"squirm\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00350531\"]}");
	add("{\"term\":\"squirmer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10800912\"]}");
	add("{\"term\":\"squirrel\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"14790368\", \"02357879\"]}");
	add("{\"term\":\"squirrelfish\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01453302\", \"02595001\"]}");
	add("{\"term\":\"squirt\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07450700\", \"10455018\"]}");
	add("{\"term\":\"squirter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04568834\"]}");
	add("{\"term\":\"squish\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07410467\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }