package org.swtk.commons.dict.wiktionary.generated.t.a.t;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryTAT000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("tatarstan", "{\"term\":\"tatarstan\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An autonomous republic in east European Russia\", \"priority\":1}]}, \"synonyms\":{}}");

	add("tater", "{\"term\":\"tater\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"Representing an aphetic pronunciation of \u0027\u0027potato\u0027\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A potato\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A home run\", \"priority\":2}]}, \"synonyms\":{}}");

	add("tathata", "{\"term\":\"tathata\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"thusness, suchness\", \"priority\":1}]}, \"synonyms\":{}}");

	add("tatsoi", "{\"term\":\"tatsoi\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{rfelite|en}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Brassica rapa subsp. narinosa\u0027 (syns. \u0027Brassica narinosa\u0027, \u0027Brasica rapa var. narinosa\u0027, \u0027Brassica rapa var. rosularis\u0027), an Asian variety of \u0027Brassica rapa\u0027 grown for greens, lately popular in North American cuisine\", \"priority\":1}]}, \"synonyms\":{}}");

	add("tatter", "{\"term\":\"tatter\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"Apparently a back-formation from \u0027tattered\u0027.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A shred of torn cloth; an individual item of torn and ragged clothing\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A person engaged in tatting\", \"priority\":2}]}, \"synonyms\":{}}");

	add("tatters", "{\"term\":\"tatters\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Ragged clothing or fabric, paper, etc\", \"priority\":1}]}, \"synonyms\":{}}");

	add("tatting", "{\"term\":\"tatting\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A form of looped and knotted lace needlework made from a single thread\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"The art of making such lace\", \"priority\":2}]}, \"synonyms\":{}}");

	add("tattle", "{\"term\":\"tattle\", \"etymology\":{\"influencers\":[], \"languages\":[\"middle dutch (ca. 1050-1350)\", \"English\", \"middle low german\"], \"text\":\"Likely akin to Middle dutch (ca. 1050-1350) Middle low german w:Saterland Frisian language|East Frisian \u0027tateren\u0027 - “to chatter, babble”, possibly of imitative origin. Attested in 1481 in William Caxton\u0027s translation of “w:Reynard|The History of Reynard the Fox” in the sense “to stutter”, probably borrowed from Middle dutch (ca. 1050-1350)\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A tattletale\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"Gossip; idle talk\", \"priority\":2}]}, \"synonyms\":{}}");

	add("tattler", "{\"term\":\"tattler\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|tattle|er|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"One who tattles (notifies authorities of illicit behavior) or is inclined to do so; a tattletale\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"My sister is a big \u0027\u0027tattler\u0027\u0027; she always tells Mommy when I hit her\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"Either of two similar bird species in the shorebird genus (\u0027Tringa\u0027 in some taxonomies\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"A device fitted to a vehicle to measure mileage etc\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"1960\u0027\u0027, Edward Hogland, \u0027The circle home\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"A few truck drivers griped drowsily about the \u0027\u0027tattlers\u0027\u0027 in their cabs which graphed the mileage per hour per day\", \"priority\":6},{\"upperType\":\"NOUN\", \"text\":\"2002\u0027\u0027, National Association of EMS Physicians, \u0027Prehospital Systems and Medical Oversight\u0027 (page 270\", \"priority\":7},{\"upperType\":\"NOUN\", \"text\":\"Electronic monitors (black box, \u0027\u0027tattlers\u0027\u0027) help to define the actions of the driver during normal and emergent operation of the EMS unit\", \"priority\":8}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }