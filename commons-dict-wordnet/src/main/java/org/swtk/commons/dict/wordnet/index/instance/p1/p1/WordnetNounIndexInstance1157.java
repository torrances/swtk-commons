package org.swtk.commons.dict.wordnet.index.instance.p1.p1;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexInstance1157 {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("11570089", "{\"term\":\"teliospore\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11570089\"]}");
	add("11570230", "{\"term\":\"tetraspore\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11570230\"]}");
	add("11570346", "{\"term\":\"zoospore\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11570346\"]}");
	add("11570473", "{\"term\":\"fern seed\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11570473\"]}");
	add("11570656", "{\"term\":\"fructification\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"11570656\", \"13506611\"]}");
	add("11570791", "{\"term\":\"gleba\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11570791\"]}");
	add("11570925", "{\"term\":\"hymenium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11570925\"]}");
	add("11571071", "{\"term\":\"pycnidium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11571071\"]}");
	add("11571176", "{\"term\":\"spore case\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"11571176\", \"13112533\"]}");
	add("11571176", "{\"term\":\"sporocarp\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11571176\"]}");
	add("11571341", "{\"term\":\"stipule\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11571341\"]}");
	add("11571495", "{\"term\":\"tepal\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11571495\"]}");
	add("11571662", "{\"term\":\"division spermatophyta\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11571662\"]}");
	add("11571662", "{\"term\":\"spermatophyta\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11571662\"]}");
	add("11572110", "{\"term\":\"phanerogamae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11572110\"]}");
	add("11572349", "{\"term\":\"cryptogamia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11572349\"]}");
	add("11572584", "{\"term\":\"cryptogam\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11572584\"]}");
	add("11572837", "{\"term\":\"phanerogam\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11572837\"]}");
	add("11572837", "{\"term\":\"seed plant\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11572837\"]}");
	add("11572837", "{\"term\":\"spermatophyte\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11572837\"]}");
	add("11573045", "{\"term\":\"seedling\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11573045\"]}");
	add("11573137", "{\"term\":\"balsam\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"02786813\", \"14920865\", \"11573137\"]}");
	add("11573257", "{\"term\":\"annual\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06438138\", \"11573257\"]}");
	add("11573427", "{\"term\":\"biennial\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11573427\"]}");
	add("11573691", "{\"term\":\"perennial\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11573691\"]}");
	add("11573870", "{\"term\":\"escape\", \"synsetCount\":8, \"upperType\":\"NOUN\", \"ids\":[\"04134734\", \"07451261\", \"11573870\", \"00174132\", \"00205048\", \"00742010\", \"00430425\", \"00059563\"]}");
	add("11573973", "{\"term\":\"hygrophyte\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11573973\"]}");
	add("11574085", "{\"term\":\"neophyte\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"09920955\", \"10375148\", \"11574085\"]}");
	add("11574214", "{\"term\":\"gymnosperm family\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11574214\"]}");
	add("11574626", "{\"term\":\"gymnosperm genus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11574626\"]}");
	add("11575864", "{\"term\":\"liliopsid family\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11575864\"]}");
	add("11575864", "{\"term\":\"monocot family\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11575864\"]}");
	add("11576638", "{\"term\":\"liliid monocot family\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11576638\"]}");
	add("11577308", "{\"term\":\"liliopsid genus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11577308\"]}");
	add("11577308", "{\"term\":\"monocot genus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11577308\"]}");
 	}  	private static void add(final String ID, final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(ID)) ? map.get(ID) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(ID, list); 	} 	 	public static Collection<IndexNoun> get(final String ID) { 		return map.get(ID); 	}  	public boolean has(final String ID) { 		return map.containsKey(ID); 	} }