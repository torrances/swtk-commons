package org.swtk.commons.dict.wiktionary.generated.t.o.i;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryTOI000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("toilet", "{\"term\":\"toilet\", \"etymology\":{\"influencers\":[{}], \"languages\":[\"English\", \"middle french (ca. 1400-1600)\"], \"text\":\"From Middle french (ca. 1400-1600) \u0027toilette\u0027 (small cloth) diminutive of {{m|fr|toile||cloth}}; a cloth used to protect garments when making up the hair or shaving.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Image:Decorative toilet thumb|right|Western thumb|right|Asian squat thumb|right|Ancient Roman toiletsImage:Antarctica Siple Dome Field Camp thumb|right|An Outdoor toilet thumb|right|portable Portable toilets in w:Georgia Georgia\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"Personal grooming; washing, dressing etc\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"1931\u0027\u0027, William Faulkner, \u0027Sanctuary\u0027, Vintage 1993, page 111\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"Three women got down and standing on the curb they made unabashed \u0027\u0027toilets\u0027\u0027, smoothing skirts and stockings, brushing one another\u0027s back, opening parcels and donning various finery\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"One\u0027s style of dressing; dress, outfit\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"quot;It is so painful in you, Celia, that you will look at human beings as if they were merely animals with a \u0027\u0027toilet\u0027\u0027, and never see the great soul in a man\u0027s face.\u0026quot\", \"priority\":6},{\"upperType\":\"NOUN\", \"text\":\"1917\u0027\u0027, Arthur Conan Doyle, s:The Adventure of Wisteria \u0026quot;The Adventure of Wisteria Lodge\u0026quot\", \"priority\":7},{\"upperType\":\"NOUN\", \"text\":\"quot;It is a quarter-past two,\u0026quot; he said. \u0026quot;Your telegram was dispatched about one. But no one can glance at your \u0027\u0027toilet\u0027\u0027 and attire without seeing that your disturbance dates from the moment of your waking.\u0026quot\", \"priority\":8},{\"upperType\":\"NOUN\", \"text\":\"A dressing room\", \"priority\":9},{\"upperType\":\"NOUN\", \"text\":\"Now specifically, a room or enclosed cubicle containing a lavatory, e.g. a bathroom or water closet (WC\", \"priority\":10},{\"upperType\":\"NOUN\", \"text\":\"there were also tons of garbage festering in the sun, and the greasy laundry of the workers hung out to dry, and dining rooms littered with food and black with flies, and \u0027\u0027toilet\u0027\u0027 rooms that were open sewers\", \"priority\":11},{\"upperType\":\"NOUN\", \"text\":\"2002\u0027\u0027, Digby Tantam, \u0027Psychotherapy and Counselling in Practice: A Narrative Framework\u0027 (page 122\", \"priority\":12},{\"upperType\":\"NOUN\", \"text\":\"He would hit her when she cried and, if this did not work, would lock her in the \u0027\u0027toilet\u0027\u0027 for hours on end\", \"priority\":13},{\"upperType\":\"NOUN\", \"text\":\"A lavatory or device for depositing human waste and then flushing it away with water\", \"priority\":14},{\"upperType\":\"NOUN\", \"text\":\"EPA is currently developing the specification for high-efficiency \u0027\u0027toilets\u0027\u0027. All HETs that meet WaterSense criteria for efficiency and performance will be eligible to receive a label once EPA finalizes the specification.\u0027 — [http://www.epa.gov/watersense/partners/specs/het.htm US Environmental Protection Agency\", \"priority\":15},{\"upperType\":\"NOUN\", \"text\":\"Other similar devices, such as squat toilets, as in Japan or the Middle East\", \"priority\":16},{\"upperType\":\"NOUN\", \"text\":\"A shabby or dirty place, especially a lounge/bar/pub/tavern\", \"priority\":17},{\"upperType\":\"NOUN\", \"text\":\"Look around you. It\u0027s a \u0027\u0027toilet\", \"priority\":18},{\"upperType\":\"NOUN\", \"text\":\"A covering of linen, silk, or tapestry, spread over a table in a chamber or dressing room\", \"priority\":19},{\"upperType\":\"NOUN\", \"text\":\"A dressing table\", \"priority\":20},{\"upperType\":\"NOUN\", \"text\":\"1904\u0027\u0027, Alexander Pope, \u0027The Rape of the Lock\u0027, Canto I, lines 121-126\", \"priority\":21},{\"upperType\":\"NOUN\", \"text\":\"And now, unveil’d, the toilet stands display’d\", \"priority\":22},{\"upperType\":\"NOUN\", \"text\":\"Each silver vase in mystic order laid\", \"priority\":23},{\"upperType\":\"NOUN\", \"text\":\"First, robed in white, the nymph intent adores\", \"priority\":24},{\"upperType\":\"NOUN\", \"text\":\"With head uncover’d, the cosmetic powers\", \"priority\":25},{\"upperType\":\"NOUN\", \"text\":\"A heav’nly image in the glass appears\", \"priority\":26},{\"upperType\":\"NOUN\", \"text\":\"To that she bends, to that her eyes she rears\", \"priority\":27}]}, \"synonyms\":{}}");

	add("toiletry", "{\"term\":\"toiletry\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Any item used for personal hygiene or grooming\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }