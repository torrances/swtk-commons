package org.swtk.commons.dict.wordnet.indexbyname.instance.b.o.g;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceBOG {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"bog\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09248850\"]}");
	add("{\"term\":\"bog asphodel\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12484248\"]}");
	add("{\"term\":\"bog aster\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11956422\"]}");
	add("{\"term\":\"bog bilberry\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12269297\"]}");
	add("{\"term\":\"bog candles\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12086519\"]}");
	add("{\"term\":\"bog hemp\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12413603\"]}");
	add("{\"term\":\"bog kalmia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12258372\"]}");
	add("{\"term\":\"bog laurel\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12258372\"]}");
	add("{\"term\":\"bog moss\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11562588\"]}");
	add("{\"term\":\"bog myrtle\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12505289\"]}");
	add("{\"term\":\"bog pimpernel\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12113146\"]}");
	add("{\"term\":\"bog plant\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13143123\"]}");
	add("{\"term\":\"bog rein orchid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12086519\"]}");
	add("{\"term\":\"bog rhubarb\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12022897\"]}");
	add("{\"term\":\"bog rose\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12066497\"]}");
	add("{\"term\":\"bog rosemary\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12250168\"]}");
	add("{\"term\":\"bog soil\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14806562\"]}");
	add("{\"term\":\"bog spavin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14296685\"]}");
	add("{\"term\":\"bog star\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12822541\"]}");
	add("{\"term\":\"bog whortleberry\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12269297\"]}");
	add("{\"term\":\"bogart\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10874643\"]}");
	add("{\"term\":\"bogbean\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12505289\"]}");
	add("{\"term\":\"bogey\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"02866978\", \"13616657\", \"09565369\"]}");
	add("{\"term\":\"bogeyman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09511247\"]}");
	add("{\"term\":\"bogie\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02866978\", \"09565369\"]}");
	add("{\"term\":\"bogmat\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11817042\"]}");
	add("{\"term\":\"bogota\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08750812\"]}");
	add("{\"term\":\"bogy\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09565369\", \"02866978\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }