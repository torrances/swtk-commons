package org.swtk.commons.dict.wordnet.indexbyname.instance.g.u.l;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceGUL {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"gula\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00760539\", \"09541586\"]}");
	add("{\"term\":\"gulag\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03472819\"]}");
	add("{\"term\":\"gulch\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09318852\"]}");
	add("{\"term\":\"gulden\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"13701960\", \"13702251\"]}");
	add("{\"term\":\"gulf\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"09318959\", \"04760315\", \"09319027\"]}");
	add("{\"term\":\"gulfweed\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01408499\"]}");
	add("{\"term\":\"gull\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02043900\", \"09940867\"]}");
	add("{\"term\":\"gullet\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05541581\"]}");
	add("{\"term\":\"gullibility\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04888351\"]}");
	add("{\"term\":\"gulliver\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09622902\"]}");
	add("{\"term\":\"gully\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09323212\"]}");
	add("{\"term\":\"gulo\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02451691\"]}");
	add("{\"term\":\"gulp\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00842024\", \"00841850\"]}");
	add("{\"term\":\"gulper\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10171477\"]}");
	add("{\"term\":\"gulping\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00844986\", \"00842024\"]}");
	add("{\"term\":\"gulu\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09066569\"]}");
	add("{\"term\":\"gulyas\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07605891\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }