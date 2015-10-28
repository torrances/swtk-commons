package org.swtk.commons.dict.wordnet.indexbyname.instance.t.i.m;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceTIM {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"timalia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01569150\"]}");
	add("{\"term\":\"timaliidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01569027\"]}");
	add("{\"term\":\"timbale\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07640810\", \"07640933\"]}");
	add("{\"term\":\"timber\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"04994869\", \"09306921\", \"04443463\", \"04443319\", \"14967718\"]}");
	add("{\"term\":\"timberland\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09306921\"]}");
	add("{\"term\":\"timberline\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08565230\"]}");
	add("{\"term\":\"timberman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10730902\"]}");
	add("{\"term\":\"timbre\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04994869\"]}");
	add("{\"term\":\"timbrel\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04443676\"]}");
	add("{\"term\":\"timbuktu\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08988436\"]}");
	add("{\"term\":\"time\", \"synsetCount\":10, \"upperType\":\"NOUN\", \"ids\":[\"15249488\", \"04998860\", \"15160774\", \"15154879\", \"07302920\", \"00028468\", \"15270326\", \"15147173\", \"15295388\", \"07324217\"]}");
	add("{\"term\":\"timecard\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04444265\", \"06516829\"]}");
	add("{\"term\":\"timekeeper\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04445087\", \"10731019\", \"10731132\"]}");
	add("{\"term\":\"timekeeping\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15198759\"]}");
	add("{\"term\":\"timelessness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13980191\"]}");
	add("{\"term\":\"timeline\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06516956\"]}");
	add("{\"term\":\"timeliness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04726102\", \"05056404\"]}");
	add("{\"term\":\"timepiece\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04445087\"]}");
	add("{\"term\":\"timer\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04445641\", \"10731132\", \"04445438\"]}");
	add("{\"term\":\"times\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00873254\", \"15145288\"]}");
	add("{\"term\":\"timeserver\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10731290\"]}");
	add("{\"term\":\"timetable\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06508388\", \"06508490\"]}");
	add("{\"term\":\"timework\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00797286\"]}");
	add("{\"term\":\"timgad\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08725245\"]}");
	add("{\"term\":\"timid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07961176\"]}");
	add("{\"term\":\"timidity\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04867990\", \"07537968\"]}");
	add("{\"term\":\"timidness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07537968\"]}");
	add("{\"term\":\"timimoun\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08725401\"]}");
	add("{\"term\":\"timing\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00808739\", \"05053160\"]}");
	add("{\"term\":\"timolol\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04445876\"]}");
	add("{\"term\":\"timor\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08928512\"]}");
	add("{\"term\":\"timorese\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10731415\"]}");
	add("{\"term\":\"timorousness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04867990\", \"07537968\"]}");
	add("{\"term\":\"timothy\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"07818128\", \"11362761\", \"12151066\"]}");
	add("{\"term\":\"timpani\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03618174\"]}");
	add("{\"term\":\"timpanist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10754620\"]}");
	add("{\"term\":\"timucu\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02552834\"]}");
	add("{\"term\":\"timur\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11350021\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }