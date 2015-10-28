package org.swtk.commons.dict.wordnet.indexbyname.instance.t.o.l;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceTOL {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"tolazamide\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04455782\"]}");
	add("{\"term\":\"tolazoline\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04455951\"]}");
	add("{\"term\":\"tolbooth\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04456561\"]}");
	add("{\"term\":\"tolbukhin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08732457\"]}");
	add("{\"term\":\"tolbutamide\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04456097\"]}");
	add("{\"term\":\"tole\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04456317\"]}");
	add("{\"term\":\"tolectin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04457067\"]}");
	add("{\"term\":\"toledo\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09049662\", \"09154108\"]}");
	add("{\"term\":\"tolerance\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"04757264\", \"06214141\", \"01073014\", \"04645280\", \"05040565\"]}");
	add("{\"term\":\"toleration\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01144645\", \"04645532\"]}");
	add("{\"term\":\"tolinase\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04455782\"]}");
	add("{\"term\":\"tolkien\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11365176\"]}");
	add("{\"term\":\"toll\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"07391844\", \"05171334\", \"13344771\"]}");
	add("{\"term\":\"tollbar\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04456821\"]}");
	add("{\"term\":\"tollbooth\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04456561\"]}");
	add("{\"term\":\"toller\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10734333\", \"10734500\"]}");
	add("{\"term\":\"tollgate\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04456821\"]}");
	add("{\"term\":\"tollgatherer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10734333\"]}");
	add("{\"term\":\"tollhouse\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04456561\"]}");
	add("{\"term\":\"tollkeeper\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10734333\"]}");
	add("{\"term\":\"tollman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10734333\"]}");
	add("{\"term\":\"tollon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12653822\"]}");
	add("{\"term\":\"tolmiea\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12824976\"]}");
	add("{\"term\":\"tolstoy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11365373\"]}");
	add("{\"term\":\"toltec\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09668954\"]}");
	add("{\"term\":\"tolu\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12572174\"]}");
	add("{\"term\":\"toluene\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15099945\"]}");
	add("{\"term\":\"tolypeutes\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02457630\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }