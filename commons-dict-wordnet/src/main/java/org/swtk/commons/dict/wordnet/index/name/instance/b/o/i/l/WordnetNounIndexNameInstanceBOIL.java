package org.swtk.commons.dict.wordnet.index.name.instance.b.o.i.l;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceBOIL {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"boil\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05021283\", \"14206692\"]}");
	add("{\"term\":\"boiler\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03618023\", \"02867090\"]}");
	add("{\"term\":\"boilerplate\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02867335\", \"07089027\"]}");
	add("{\"term\":\"boilersuit\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03868782\"]}");
	add("{\"term\":\"boiling\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00248659\", \"13461952\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }