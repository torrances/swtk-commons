package org.swtk.commons.dict.wordnet.byid.generated.p0.p1;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexById0143 {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("01430040", "{\"term\":\"microsporidian\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01430040\"]}");
	add("01430188", "{\"term\":\"myxosporidia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01430188\"]}");
	add("01430188", "{\"term\":\"order myxosporidia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01430188\"]}");
	add("01430344", "{\"term\":\"myxosporidian\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01430344\"]}");
	add("01430489", "{\"term\":\"pseudopod\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01430489\"]}");
	add("01430489", "{\"term\":\"pseudopodium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01430489\"]}");
	add("01430644", "{\"term\":\"plasmodium\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01427061\", \"01430644\"]}");
	add("01430796", "{\"term\":\"malacopterygii\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01430796\"]}");
	add("01430796", "{\"term\":\"superorder malacopterygii\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01430796\"]}");
	add("01431221", "{\"term\":\"malacopterygian\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01431221\"]}");
	add("01431221", "{\"term\":\"soft-finned fish\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01431221\"]}");
	add("01431813", "{\"term\":\"order ostariophysi\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01431813\"]}");
	add("01431813", "{\"term\":\"ostariophysi\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01431813\"]}");
	add("01431990", "{\"term\":\"fish family\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01431990\"]}");
	add("01435158", "{\"term\":\"fish genus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01435158\"]}");
 	}  	private static void add(final String ID, final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(ID)) ? map.get(ID) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(ID, list); 	} 	 	public static Collection<IndexNoun> get(final String ID) { 		return map.get(ID); 	}  	public boolean has(final String ID) { 		return map.containsKey(ID); 	} }