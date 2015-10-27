package org.swtk.commons.dict.wordnet.index.name.instance.r.e.d.u;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceREDU {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"reducer\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04073771\", \"14804426\"]}");
	add("{\"term\":\"reducing\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"13568716\", \"13568880\"]}");
	add("{\"term\":\"reductant\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14804426\"]}");
	add("{\"term\":\"reductase\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15028212\"]}");
	add("{\"term\":\"reductio\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05833309\"]}");
	add("{\"term\":\"reduction\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00193149\", \"13568880\", \"00352464\"]}");
	add("{\"term\":\"reductionism\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05790445\", \"05790560\"]}");
	add("{\"term\":\"reductivism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08486244\"]}");
	add("{\"term\":\"redundance\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05127610\"]}");
	add("{\"term\":\"redundancy\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"01021190\", \"05738108\", \"05127610\", \"07105130\"]}");
	add("{\"term\":\"reduplication\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"01021314\", \"06314140\", \"06316600\", \"07114264\"]}");
	add("{\"term\":\"reduviid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02246825\"]}");
	add("{\"term\":\"reduviidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02246659\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }