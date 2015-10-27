package org.swtk.commons.dict.wordnet.index.name.instance.b.o.t.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceBOTT {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"botticelli\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10878608\"]}");
	add("{\"term\":\"bottle\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"02880508\", \"13787536\", \"02879899\"]}");
	add("{\"term\":\"bottlebrush\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02880884\"]}");
	add("{\"term\":\"bottlecap\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02881007\"]}");
	add("{\"term\":\"bottleful\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13787536\"]}");
	add("{\"term\":\"bottleneck\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02881107\", \"13936007\"]}");
	add("{\"term\":\"bottlenose\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02071194\", \"02072353\"]}");
	add("{\"term\":\"bottler\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08083480\"]}");
	add("{\"term\":\"bottom\", \"synsetCount\":7, \"upperType\":\"NOUN\", \"ids\":[\"02881464\", \"09250335\", \"09240545\", \"15281056\", \"05566889\", \"08529042\", \"08528313\"]}");
	add("{\"term\":\"bottomland\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09250335\"]}");
	add("{\"term\":\"bottomlessness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05142847\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }