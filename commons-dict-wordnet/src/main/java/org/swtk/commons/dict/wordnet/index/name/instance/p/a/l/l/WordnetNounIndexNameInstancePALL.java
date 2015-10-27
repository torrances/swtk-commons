package org.swtk.commons.dict.wordnet.index.name.instance.p.a.l.l;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstancePALL {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"pall\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"03155743\", \"03884813\", \"07552647\"]}");
	add("{\"term\":\"palladio\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11241485\"]}");
	add("{\"term\":\"palladium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14672932\"]}");
	add("{\"term\":\"pallas\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09406891\", \"09580516\"]}");
	add("{\"term\":\"pallasite\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09406999\"]}");
	add("{\"term\":\"pallbearer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10414772\"]}");
	add("{\"term\":\"pallet\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"03884371\", \"03885033\", \"03885153\", \"03885279\", \"05135635\"]}");
	add("{\"term\":\"pallette\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03885402\"]}");
	add("{\"term\":\"palliasse\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03880766\"]}");
	add("{\"term\":\"palliation\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00355409\", \"00356373\"]}");
	add("{\"term\":\"palliative\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03885551\"]}");
	add("{\"term\":\"pallidity\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04982879\"]}");
	add("{\"term\":\"pallidness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04984828\"]}");
	add("{\"term\":\"pallidum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05505951\"]}");
	add("{\"term\":\"pallium\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"03885729\", \"03885826\", \"05251388\", \"05494162\"]}");
	add("{\"term\":\"pallone\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00484859\"]}");
	add("{\"term\":\"pallor\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04984828\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }