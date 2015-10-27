package org.swtk.commons.dict.wordnet.index.name.instance.b.i.r.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceBIRT {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"birth\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"09876077\", \"13835977\", \"13554089\", \"07334902\", \"15167127\"]}");
	add("{\"term\":\"birthday\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"15277233\", \"15274989\"]}");
	add("{\"term\":\"birthing\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13554089\"]}");
	add("{\"term\":\"birthmark\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04699986\"]}");
	add("{\"term\":\"birthplace\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08527477\", \"08527371\"]}");
	add("{\"term\":\"birthrate\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15301413\"]}");
	add("{\"term\":\"birthright\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04928485\", \"13284819\", \"04928753\"]}");
	add("{\"term\":\"birthroot\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12489405\"]}");
	add("{\"term\":\"birthwort\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11821861\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }