package org.swtk.commons.dict.wordnet.index.name.instance.z.y.g.o;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceZYGO {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"zygocactus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11874701\"]}");
	add("{\"term\":\"zygoma\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05292350\"]}");
	add("{\"term\":\"zygomatic\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05281321\"]}");
	add("{\"term\":\"zygomycetes\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12993389\"]}");
	add("{\"term\":\"zygomycota\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12993174\"]}");
	add("{\"term\":\"zygomycotina\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12993174\"]}");
	add("{\"term\":\"zygophyllaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12741292\"]}");
	add("{\"term\":\"zygophyllum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12741653\"]}");
	add("{\"term\":\"zygoptera\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02271398\"]}");
	add("{\"term\":\"zygospore\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13260819\"]}");
	add("{\"term\":\"zygote\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05439502\"]}");
	add("{\"term\":\"zygotene\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13596312\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }