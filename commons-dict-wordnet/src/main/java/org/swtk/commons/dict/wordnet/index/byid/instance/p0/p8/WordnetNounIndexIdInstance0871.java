package org.swtk.commons.dict.wordnet.index.byid.instance.p0.p8;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexIdInstance0871 {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("08713012", "{\"term\":\"provincial capital\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08713012\"]}");
	add("08713353", "{\"term\":\"state capital\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08713353\"]}");
	add("08714551", "{\"term\":\"continent\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08714551\", \"09277520\"]}");
	add("08714745", "{\"term\":\"european country\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08714745\"]}");
	add("08714745", "{\"term\":\"european nation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08714745\"]}");
	add("08715641", "{\"term\":\"scandinavian country\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08715641\"]}");
	add("08715641", "{\"term\":\"scandinavian nation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08715641\"]}");
	add("08715852", "{\"term\":\"balkans\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"08715852\", \"08731605\", \"09235983\"]}");
	add("08715940", "{\"term\":\"balkan country\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08715940\"]}");
	add("08715940", "{\"term\":\"balkan nation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08715940\"]}");
	add("08715940", "{\"term\":\"balkan state\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08715940\"]}");
	add("08716193", "{\"term\":\"african country\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08716193\"]}");
	add("08716193", "{\"term\":\"african nation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08716193\"]}");
	add("08717240", "{\"term\":\"east africa\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08717240\"]}");
	add("08717468", "{\"term\":\"namibia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08717468\"]}");
	add("08717468", "{\"term\":\"republic of namibia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08717468\"]}");
	add("08717468", "{\"term\":\"south west africa\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08717468\"]}");
	add("08717947", "{\"term\":\"windhoek\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08717947\"]}");
	add("08718069", "{\"term\":\"asian country\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08718069\"]}");
	add("08718069", "{\"term\":\"asian nation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08718069\"]}");
	add("08718975", "{\"term\":\"cappadocia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08718975\"]}");
	add("08719110", "{\"term\":\"galatia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08719110\"]}");
	add("08719224", "{\"term\":\"phrygia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08719224\"]}");
	add("08719369", "{\"term\":\"colossae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08719369\"]}");
	add("08719533", "{\"term\":\"pontus\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08719533\", \"09591905\"]}");
	add("08719756", "{\"term\":\"anatolia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08719756\"]}");
	add("08719756", "{\"term\":\"asia minor\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08719756\"]}");
 	}  	private static void add(final String ID, final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(ID)) ? map.get(ID) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(ID, list); 	} 	 	public static Collection<IndexNoun> get(final String ID) { 		return map.get(ID); 	}  	public boolean has(final String ID) { 		return map.containsKey(ID); 	} }