package org.swtk.commons.dict.wordnet.byid.generated.p0.p6;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexById0610 {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("06100128", "{\"term\":\"nuclear chemistry\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06100128\"]}");
	add("06100128", "{\"term\":\"radiochemistry\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06100128\"]}");
	add("06100266", "{\"term\":\"surface chemistry\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06100266\"]}");
	add("06100457", "{\"term\":\"natural philosophy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06100457\"]}");
	add("06100457", "{\"term\":\"physics\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06104194\", \"06100457\"]}");
	add("06104194", "{\"term\":\"physical science\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06104194\"]}");
	add("06104194", "{\"term\":\"physics\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06104194\", \"06100457\"]}");
	add("06104381", "{\"term\":\"acoustics\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06104381\"]}");
	add("06104629", "{\"term\":\"astronomy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06104629\"]}");
	add("06104629", "{\"term\":\"uranology\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06104629\"]}");
	add("06106058", "{\"term\":\"astrodynamics\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06106058\"]}");
	add("06106207", "{\"term\":\"astrometry\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06106207\"]}");
	add("06106366", "{\"term\":\"radio astronomy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06106366\"]}");
	add("06106520", "{\"term\":\"aeronautics\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06106520\"]}");
	add("06106520", "{\"term\":\"astronautics\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06106520\"]}");
	add("06106838", "{\"term\":\"avionics\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06106838\"]}");
	add("06107085", "{\"term\":\"biophysics\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06107085\"]}");
	add("06107201", "{\"term\":\"celestial mechanics\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06107201\"]}");
	add("06107382", "{\"term\":\"astrophysics\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06107382\"]}");
	add("06107590", "{\"term\":\"selenology\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06107590\"]}");
	add("06107695", "{\"term\":\"solar physics\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06107695\"]}");
	add("06107802", "{\"term\":\"cosmogeny\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06107802\"]}");
	add("06107802", "{\"term\":\"cosmogony\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06107802\"]}");
	add("06107802", "{\"term\":\"cosmology\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06107802\", \"06172939\"]}");
	add("06108294", "{\"term\":\"cryogenics\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06108294\"]}");
	add("06108294", "{\"term\":\"cryogeny\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06108294\"]}");
	add("06108483", "{\"term\":\"crystallography\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06108483\"]}");
	add("06108714", "{\"term\":\"electromagnetics\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06108714\"]}");
	add("06108714", "{\"term\":\"electromagnetism\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06108714\", \"11499768\"]}");
	add("06108876", "{\"term\":\"electronics\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06108876\"]}");
	add("06109708", "{\"term\":\"electrostatics\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06109708\"]}");
	add("06109843", "{\"term\":\"mechanics\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00099205\", \"06109843\"]}");
 	}  	private static void add(final String ID, final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(ID)) ? map.get(ID) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(ID, list); 	} 	 	public static Collection<IndexNoun> get(final String ID) { 		return map.get(ID); 	}  	public boolean has(final String ID) { 		return map.containsKey(ID); 	} }