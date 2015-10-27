package org.swtk.commons.dict.wordnet.index.name.instance.s.t.a.n;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSTAN {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"stance\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06206019\", \"05089714\"]}");
	add("{\"term\":\"stanchion\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04307781\"]}");
	add("{\"term\":\"stand\", \"synsetCount\":12, \"upperType\":\"NOUN\", \"ids\":[\"00962962\", \"02790007\", \"04307879\", \"01058977\", \"04306353\", \"06220098\", \"07380745\", \"04044916\", \"04308138\", \"08455376\", \"08671281\", \"02800851\"]}");
	add("{\"term\":\"standard\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"04308278\", \"04308380\", \"13394387\", \"13639233\", \"05933552\", \"07275291\"]}");
	add("{\"term\":\"standardisation\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"01001187\", \"01161177\", \"13961473\"]}");
	add("{\"term\":\"standardiser\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10667021\"]}");
	add("{\"term\":\"standardization\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"01001187\", \"01161177\", \"13961473\"]}");
	add("{\"term\":\"standardizer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10667021\"]}");
	add("{\"term\":\"standby\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10756760\", \"04309057\"]}");
	add("{\"term\":\"standdown\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00057982\", \"14037312\"]}");
	add("{\"term\":\"standee\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04309172\", \"10667184\"]}");
	add("{\"term\":\"stander\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10667472\"]}");
	add("{\"term\":\"standing\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00349906\", \"06508107\", \"13971316\"]}");
	add("{\"term\":\"standish\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11332357\"]}");
	add("{\"term\":\"standoff\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00963112\", \"07368316\"]}");
	add("{\"term\":\"standoffishness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04664353\"]}");
	add("{\"term\":\"standpipe\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04309665\"]}");
	add("{\"term\":\"standpoint\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06220098\"]}");
	add("{\"term\":\"standstill\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07380745\", \"14038832\"]}");
	add("{\"term\":\"stanford\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04309878\", \"11332551\"]}");
	add("{\"term\":\"stanhope\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04310001\"]}");
	add("{\"term\":\"stanhopea\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12105407\"]}");
	add("{\"term\":\"stanislavsky\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11332704\"]}");
	add("{\"term\":\"stanley\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"11333006\", \"11333352\"]}");
	add("{\"term\":\"stanleya\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11917811\"]}");
	add("{\"term\":\"stannite\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15078135\"]}");
	add("{\"term\":\"stanton\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11333502\"]}");
	add("{\"term\":\"stanza\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07066331\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }