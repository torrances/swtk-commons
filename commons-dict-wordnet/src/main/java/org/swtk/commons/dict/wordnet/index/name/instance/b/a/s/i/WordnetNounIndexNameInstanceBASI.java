package org.swtk.commons.dict.wordnet.index.name.instance.b.a.s.i;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceBASI {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"basia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08934186\"]}");
	add("{\"term\":\"basic\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02803952\", \"06915685\"]}");
	add("{\"term\":\"basics\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05879984\", \"06652212\"]}");
	add("{\"term\":\"basidiocarp\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11553663\"]}");
	add("{\"term\":\"basidiolichen\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13008295\"]}");
	add("{\"term\":\"basidiomycete\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13018414\"]}");
	add("{\"term\":\"basidiomycetes\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13017601\"]}");
	add("{\"term\":\"basidiomycota\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13016985\"]}");
	add("{\"term\":\"basidiomycotina\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13016985\"]}");
	add("{\"term\":\"basidiospore\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11568916\"]}");
	add("{\"term\":\"basidium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13015235\"]}");
	add("{\"term\":\"basil\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"07832140\", \"10857514\", \"12881125\"]}");
	add("{\"term\":\"basileus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09861253\"]}");
	add("{\"term\":\"basilica\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02804213\", \"02804350\"]}");
	add("{\"term\":\"basilicata\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08822339\"]}");
	add("{\"term\":\"basiliscus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01684934\"]}");
	add("{\"term\":\"basilisk\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"01685076\", \"02804616\", \"09516008\"]}");
	add("{\"term\":\"basin\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"04561206\", \"08536123\", \"09238344\", \"13787226\", \"02804691\"]}");
	add("{\"term\":\"basinet\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02804989\"]}");
	add("{\"term\":\"basinful\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13787226\"]}");
	add("{\"term\":\"basis\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"13831981\", \"05801562\", \"13813124\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }